public class Saboteur extends Spy {
    @Override
    public void visitGeneralStaff(GeneralStaff generalStaff) {
        int destroyedDocuments = generalStaff.getSecretPaper();
        generalStaff.setSecretPaper(generalStaff.getSecretPaper() - destroyedDocuments);
        System.out.println("Saboteur destroyed " + destroyedDocuments + " secret papers");
    }

    @Override
    public void visitMilitaryBase(MilitaryBase militaryBase) {
        int killedOfficers = militaryBase.getOfficers();
        int killedSoldiers = militaryBase.getSoldiers();
        int destroyedJeeps = militaryBase.getJeeps();
        int destroyedTanks = militaryBase.getTanks();
        militaryBase.setOfficers(militaryBase.getOfficers() - killedOfficers);
        militaryBase.setSoldiers(militaryBase.getSoldiers() - killedSoldiers);
        militaryBase.setJeeps(militaryBase.getJeeps() - destroyedJeeps);
        militaryBase.setTanks(militaryBase.getTanks() - destroyedTanks);
        System.out.println("Saboteur killed " + (killedOfficers + killedSoldiers) + " personnel,and " + (destroyedJeeps + destroyedTanks) + " pieces of equipment.");
    }
}
