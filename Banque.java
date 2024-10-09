package TP2;

public class Banque {
		public static void main(String[] args) {
        Compte co1 = new Compte();
        Compte co2 = new Compte();
        System.out.println("Compte " + co1.num+ ", Solde " + co1.avoirSolde());
        System.out.println("Compte " + co2.num+ ", Solde " + co2.avoirSolde());
        co1.deposer(1200);
        co2.deposer(500);
        System.out.println("Solde apres deposer: Compte " + co1.num+ " = " + co1.avoirSolde() + ", Compte  " + co2.num+ " = " + co2.avoirSolde());
        co2.transferer(700, co1);
        System.out.println("Solde apres transfert: Compte " + co1.num+ " = " + co1.avoirSolde() + ", Compte " + co2.num+ " = " + co2.avoirSolde());
        if (co1.avoirSolde() < 0) {
            System.out.println("Le compte 1 est en rouge");
        }
        if (co2.avoirSolde() < 0) {
            System.out.println("Le compte 2 est en rouge");
        }
    }
}
