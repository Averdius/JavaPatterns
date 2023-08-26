public class SecretAgent extends Spy {
    @Override
    public void visitGeneralStaff(GeneralStaff generalStaff) {
        int secretPapers = generalStaff.getSecretPaper();
        generalStaff.setSecretPaper(generalStaff.getSecretPaper() - secretPapers);
        System.out.println("Agent stole " + secretPapers + " secret papers.");
    }

    @Override
    public void visitMilitaryBase(MilitaryBase militaryBase) {
    }
}
