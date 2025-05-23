// Copyright 2012- Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

import static jminusminus.CLConstants.GOTO;


/**
 * An AST node for a break-statement.
 */
public class JBreakStatement extends JStatement {
    /**
     * Constructs an AST node for a break-statement.
     *
     * @param line line in which the break-statement occurs in the source file.
     */


    private JStatement enclosingStatement;


    public JBreakStatement(int line) {
        super(line);
    }

    /**
     * {@inheritDoc}
     */
    public JStatement analyze(Context context) {
        if (!JMember.enclosingStatement.isEmpty()) {
            enclosingStatement = JMember.enclosingStatement.peek();
            if (enclosingStatement instanceof JForStatement) {
                ((JForStatement) enclosingStatement).hasBreak = true;
            } else if (enclosingStatement instanceof JDoStatement) {
                ((JDoStatement) enclosingStatement).hasBreak = true;
            } else if (enclosingStatement instanceof JWhileStatement) {
                ((JWhileStatement) enclosingStatement).hasBreak = true;
            } else if (enclosingStatement instanceof JSwitchStatement) {
                ((JSwitchStatement) enclosingStatement).hasBreak = true;

            } else {
                // Handle error: break-statement not within a loop or switch statement
                throw new RuntimeException("Error at line " + line() + ": break-statement not within a loop or switch statement");

            }
        }
        return this;
    }

    /**
     * {@inheritDoc}
     */
    public void codegen(CLEmitter output) {
        String breakLabel;
        if (enclosingStatement != null) {
            if (enclosingStatement instanceof JForStatement) {
                breakLabel = ((JForStatement) enclosingStatement).breakLabel;
                output.addBranchInstruction(GOTO, breakLabel);
            } else if (enclosingStatement instanceof JDoStatement) {
                breakLabel = ((JDoStatement) enclosingStatement).breakLabel;
                output.addBranchInstruction(GOTO, breakLabel);

            } else if (enclosingStatement instanceof JWhileStatement) {
                breakLabel = ((JWhileStatement) enclosingStatement).breakLabel;
                output.addBranchInstruction(GOTO, breakLabel);
            } else if (enclosingStatement instanceof JSwitchStatement) {
                breakLabel = ((JSwitchStatement) enclosingStatement).breakLabel;
                output.addBranchInstruction(GOTO, breakLabel);
            }

            if (enclosingStatement instanceof JIfStatement)
                JAST.compilationUnit.reportSemanticError(line(), "Found break inside an if statement.");


        }
    }


    /**
     * {@inheritDoc}
     */
    public void toJSON(JSONElement json) {
        JSONElement e = new JSONElement();
        json.addChild("JBreakStatement:" + line, e);
    }
}
