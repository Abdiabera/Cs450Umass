// Copyright 2012- Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import static jminusminus.CLConstants.GOTO;

/**
 * The AST node for a while-statement.
 */
class JWhileStatement extends JStatement {
    // Test expression.
    private JExpression condition;

    //Body.
    private JStatement body;

    // this is whether this while loop has a break statement.
    public boolean hasBreak;

    //this is the label for the break statement target.
    public String breakLabel;

    // Whether this while loop has a continue statement.
    public boolean hasContinue;

    // The label for the continue statement target.
    public String continueLabel;

    /**
     * Constructs an AST node for a while-statement.
     *
     * @param line      line in which the while-statement occurs in the source file.
     * @param condition test expression.
     * @param body      the body.
     */
    public JWhileStatement(int line, JExpression condition, JStatement body) {
        super(line);
        this.condition = condition;
        this.body = body;
    }

    /**
     * {@inheritDoc}
     */
    public JWhileStatement analyze(Context context) {
        condition = condition.analyze(context);
        condition.type().mustMatchExpected(line(), Type.BOOLEAN);
        LocalContext localContext = new LocalContext(context);
        body = (JStatement) body.analyze(localContext);
        JMember.enclosingStatement.push(this);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    public void codegen(CLEmitter output) {
        String test = output.createLabel();
        String out = output.createLabel();
        breakLabel = output.createLabel();
        continueLabel = output.createLabel();
        output.addLabel(test);
        condition.codegen(output, out, false);
        // Support for continue statement
        output.addLabel(continueLabel);
        body.codegen(output);
        output.addBranchInstruction(GOTO, test);
        // Support for break statement
        output.addLabel(breakLabel);
        output.addLabel(out);


    }

    /**
     * {@inheritDoc}
     */
    public void toJSON(JSONElement json) {
        JSONElement e = new JSONElement();
        json.addChild("JWhileStatement:" + line, e);
        JSONElement e1 = new JSONElement();
        e.addChild("Condition", e1);
        condition.toJSON(e1);
        JSONElement e2 = new JSONElement();
        e.addChild("Body", e2);
        body.toJSON(e2);
    }
}
