package hvqzao.rewrite;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TokenRewriteEditPane extends javax.swing.JPanel {

    /**
     * Creates new form TokenRewriteEdit
     */
    public TokenRewriteEditPane() {
        initComponents();
    }

    public JLabel getScopeLabel() {
        return scopeLabel;
    }

    public JButton getEditHelp() {
        return editHelp;
    }

    public JCheckBox getIsInScope() {
        return isInScope;
    }

    public JRadioButton getIsLiteral() {
        return isLiteral;
    }

    public JTextField getStartWith() {
        return startWith;
    }

    public JTextField getEndsWith() {
        return endsWith;
    }

    public JRadioButton getIsRegex() {
        return isRegex;
    }

    public JTextField getRegexMatch() {
        return regexMatch;
    }

    public JCheckBox getLogGet() {
        return logGet;
    }

    public JTextField getCookieName() {
        return cookieName;
    }

    public JCheckBox getIsCookie() {
        return isCookie;
    }

    public JCheckBox getIsRequestParameter() {
        return isRequestParameter;
    }

    public JTextField getRequestParameter() {
        return requestParameter;
    }

    public JCheckBox getLogSet() {
        return logSet;
    }

    public JButton getEditRequest() {
        return editRequest;
    }

    public JCheckBox getIssueRequest() {
        return issueRequest;
    }

    public JCheckBox getReIssue() {
        return reIssue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        editHelp = new javax.swing.JButton();
        isInScope = new javax.swing.JCheckBox();
        requestParameter = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        endsWith = new javax.swing.JTextField();
        startWith = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        scopeLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        isRequestParameter = new javax.swing.JCheckBox();
        logGet = new javax.swing.JCheckBox();
        isCookie = new javax.swing.JCheckBox();
        cookieName = new javax.swing.JTextField();
        logSet = new javax.swing.JCheckBox();
        isLiteral = new javax.swing.JRadioButton();
        isRegex = new javax.swing.JRadioButton();
        regexMatch = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        issueRequest = new javax.swing.JCheckBox();
        editRequest = new javax.swing.JButton();
        reIssue = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        editHelp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        editHelp.setMaximumSize(new java.awt.Dimension(24, 24));
        editHelp.setMinimumSize(new java.awt.Dimension(24, 24));
        editHelp.setPreferredSize(new java.awt.Dimension(24, 24));

        isInScope.setText("In scope requests only");

        jLabel2.setText("Response search starts with:");

        jLabel3.setText("...and ends with:");

        scopeLabel.setText("Scope:");

        jLabel5.setText("Search:");

        jLabel6.setText("Use value to:");

        isRequestParameter.setText("Update future requests parameter:");

        logGet.setText("Log retrieved value to extension output");

        isCookie.setText("Update cookie in cookie Jar:");

        logSet.setText("Log update to extension output");

        buttonGroup1.add(isLiteral);
        isLiteral.setSelected(true);
        isLiteral.setText("Literal");

        buttonGroup1.add(isRegex);
        isRegex.setText("Regex match using parentheses:");
        isRegex.setActionCommand("Regex");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        issueRequest.setText("Issue specific request:");
        issueRequest.setEnabled(false);

        editRequest.setText("Edit request");
        editRequest.setEnabled(false);

        reIssue.setText("When parameter is present, re-issue request used to get token last time");
        reIssue.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reIssue)
                    .addComponent(isLiteral)
                    .addComponent(jLabel5)
                    .addComponent(isInScope)
                    .addComponent(scopeLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(26, 26, 26))
                                    .addComponent(isRequestParameter)
                                    .addComponent(jLabel6)
                                    .addComponent(logGet)
                                    .addComponent(isRegex))
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(logSet)
                            .addComponent(isCookie)
                            .addComponent(issueRequest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(endsWith, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(requestParameter, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(startWith, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(regexMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(editRequest)
                                .addComponent(cookieName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scopeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(isInScope)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isLiteral)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(startWith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(endsWith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(regexMatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isRegex))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logGet)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isRequestParameter)
                            .addComponent(requestParameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reIssue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isCookie)
                    .addComponent(cookieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issueRequest)
                    .addComponent(editRequest))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logSet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cookieName;
    private javax.swing.JButton editHelp;
    private javax.swing.JButton editRequest;
    private javax.swing.JTextField endsWith;
    private javax.swing.JCheckBox isCookie;
    private javax.swing.JCheckBox isInScope;
    private javax.swing.JRadioButton isLiteral;
    private javax.swing.JRadioButton isRegex;
    private javax.swing.JCheckBox isRequestParameter;
    private javax.swing.JCheckBox issueRequest;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox logGet;
    private javax.swing.JCheckBox logSet;
    private javax.swing.JCheckBox reIssue;
    private javax.swing.JTextField regexMatch;
    private javax.swing.JTextField requestParameter;
    private javax.swing.JLabel scopeLabel;
    private javax.swing.JTextField startWith;
    // End of variables declaration//GEN-END:variables
}
