// Copyright 2012- Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import static jminusminus.CLConstants.GOTO;

/**
 * An AST node for a continue-statement.
 */
public class JContinueStatement extends JStatement {
    /**
     * Constructs an AST node for a continue-statement.
     *
     * @param line line in which the continue-statement occurs in the source file.
     */
    private JStatement enclosingStatement;

    String continueLabel;

    public JContinueStatement(int line) {
        super(line);
    }

    /**
     * {@inheritDoc}
     */
    public JStatement analyze(Context context) {
        // TODO
        if (!JMember.enclosingStatement.isEmpty()) {
            enclosingStatement = JMember.enclosingStatement.peek();
            if (enclosingStatement instanceof JWhileStatement) {
                ((JWhileStatement) enclosingStatement).hasContinue = true;
            } else if (enclosingStatement instanceof JDoStatement) {
                ((JDoStatement) enclosingStatement).hasContinue = true;
            } else if (enclosingStatement instanceof JForStatement) {
                ((JForStatement) enclosingStatement).hasContinue = true;
            }
        } else {
            // Handle error: continue-statement not within a loop
            throw new RuntimeException("Error at line " + line() + ": continue-statement not within a loop");
        }
        return this;
    }

    /**
     * {@inheritDoc}
     */
    public void codegen(CLEmitter output) {
        // TODO
        String continueLabel;
        if (enclosingStatement != null) {
            if (enclosingStatement instanceof JWhileStatement) {
                continueLabel = ((JWhileStatement) enclosingStatement).continueLabel;
                output.addBranchInstruction(GOTO, continueLabel);
            } else if (enclosingStatement instanceof JDoStatement) {
                continueLabel = ((JDoStatement) enclosingStatement).continueLabel;
                output.addBranchInstruction(GOTO, continueLabel);
            } else if (enclosingStatement instanceof JForStatement) {
                continueLabel = ((JForStatement) enclosingStatement).continueLabel;
                output.addBranchInstruction(GOTO, continueLabel);
            }

        }
    }


    public String getContinueLabel() {

        return continueLabel;
    }


    /**
     * {@inheritDoc}
     */
    public void toJSON(JSONElement json) {
        JSONElement e = new JSONElement();
        json.addChild("JContinueStatement:" + line, e);
    }
}
