import java.util.ArrayList;

/*
public class EventCreator
{
    public void eventCreator(){


        event1.addProposition(propositon1Bombardement);
        event1.addProposition(proposition2Bombardement);

        Event event2 = new Event("Attaque de gaz", Season.All);
        Proposition proposition1AttaqueDeGaz = new Proposition("Fournir des masques à gaz à toute la population");
        proposition1AttaqueDeGaz.setReligieux(3);
        proposition1AttaqueDeGaz.setLibéraux(-3);
        proposition1AttaqueDeGaz.setEcologistes(-2);
        proposition1AttaqueDeGaz.setMilitaristes(-1);

        Proposition proposition2AttaqueDeGaz = new Proposition("Ne rien faire");
        proposition2AttaqueDeGaz.setMilitaristes(-3);
        proposition2AttaqueDeGaz.setEcologistes(-2);
        proposition2Bombardement.setLibéraux(-3);
        proposition2Bombardement.setEcologistes(-1);

        event2.addProposition(proposition1AttaqueDeGaz);
        event2.addProposition(proposition2AttaqueDeGaz);
    }






        private ArrayList<event> eventList = new ArrayList();

        //event.tag : allSeason quand l'évènement est possible dans toutes les saisons, sinon, saison(s) spécifiée(s)
        //chaque évènement possède le tag de chaque scénario auquel il peut participer
        public void evenlk,tCreator(){
            event event1 = new event();
            event1.title = "Bombardement";
            event1.textProposition1 = "Abbattre les bombardiers";
            event1.propositon1.capitalistes = -5;
            event1.propositon1.loyalistes = 5;
            event1.propositon1.communistes = -5;
            event1.propositon1.libéraux = -5;
            event1.propositon1.militaristes = 10;
            event1.propositon1.nationalistes = 10;
            event1.propositon1.écologistes = -10;
            event1.propositon1.religieux = -10;
            event1.textProposition2 = "Contre-attaquer";
            event1.propositon2.capitalistes = -5;
            event1.propositon2.loyalistes = -5;
            event1.propositon2.communistes = -5;
            event1.propositon2.libéraux = 5;
            event1.propositon2.militaristes = 15;
            event1.propositon2.nationalistes = 15;
            event1.propositon2.écologistes = -15;
            event1.propositon2.religieux = -15;
            event1.tags.add("guerre");
            event1.tags.add("allSeasons");
            eventList.add(event1);

            event event2 = new event();
            event2.title = "Attaque de gaz";
            event2.textProposition1 = "Fournir des masques à gaz à toute la population";
            event2.propositon1.capitalistes = -5;
            event2.propositon1.loyalistes = 5;
            event2.propositon1.communistes = -5;
            event2.propositon1.libéraux = -5;
            event2.propositon1.militaristes = 10;
            event2.propositon1.nationalistes = 10;
            event2.propositon1.écologistes = -10;
            event2.propositon1.religieux = -10;
            event2.textProposition2 = "Ne rien faire";
            event2.propositon2.capitalistes = -5;
            event2.propositon2.loyalistes = -5;
            event2.propositon2.communistes = -5;
            event2.propositon2.libéraux = 5;
            event2.propositon2.militaristes = 15;
            event2.propositon2.nationalistes = 15;
            event2.propositon2.écologistes = -15;
            event2.propositon2.religieux = -15;
            event2.tags.add("guerre");
            event2.tags.add("allSeasons");
            eventList.add(event2);

            event event3 = new event();
            event3.title = "Faiblesse détéctée dans les défenses enemis";
            event3.textProposition1 = "Foncer et détruire les défenses";
            event3.propositon1.capitalistes = -5;
            event3.propositon1.loyalistes = 5;
            event3.propositon1.communistes = -5;
            event3.propositon1.libéraux = -5;
            event3.propositon1.militaristes = 10;
            event3.propositon1.nationalistes = 10;
            event3.propositon1.écologistes = -10;
            event3.propositon1.religieux = -10;
            event3.textProposition2 = "C'est un piège !";
            event3.propositon2.capitalistes = -5;
            event3.propositon2.loyalistes = -5;
            event3.propositon2.communistes = -5;
            event3.propositon2.libéraux = 5;
            event3.propositon2.militaristes = 15;
            event3.propositon2.nationalistes = 15;
            event3.propositon2.écologistes = -15;
            event3.propositon2.religieux = -15;
            event3.tags.add("guerre");
            event3.tags.add("allSeasons");
            eventList.add(event3);

            event event4 = new event();
            event4.title = "Nouveau modèle de fusils opérationnel !";
            event4.textProposition1 = "Equiper tout le monde";
            event4.propositon1.capitalistes = -5;
            event4.propositon1.loyalistes = 5;
            event4.propositon1.communistes = -5;
            event4.propositon1.libéraux = -5;
            event4.propositon1.militaristes = 10;
            event4.propositon1.nationalistes = 10;
            event4.propositon1.écologistes = -10;
            event4.propositon1.religieux = -10;
            event4.textProposition2 = "Equiper uniquement les unités spéciales";
            event4.propositon2.capitalistes = -5;
            event4.propositon2.loyalistes = -5;
            event4.propositon2.communistes = -5;
            event4.propositon2.libéraux = 5;
            event4.propositon2.militaristes = 15;
            event4.propositon2.nationalistes = 15;
            event4.propositon2.écologistes = -15;
            event4.propositon2.religieux = -15;
            event4.tags.add("guerre");
            event4.tags.add("allSeasons");
            eventList.add(event4);

            event event5 = new event();
            event5.title = "Explosion de l'usine d'armement";
            event5.textProposition1 = "La réparer";
            event5.propositon1.capitalistes = -5;
            event5.propositon1.loyalistes = 5;
            event5.propositon1.communistes = -5;
            event5.propositon1.libéraux = -5;
            event5.propositon1.militaristes = 10;
            event5.propositon1.nationalistes = 10;
            event5.propositon1.écologistes = -10;
            event5.propositon1.religieux = -10;
            event5.textProposition2 = "Utiliser les stocks d'armes";
            event5.propositon2.capitalistes = -5;
            event5.propositon2.loyalistes = -5;
            event5.propositon2.communistes = -5;
            event5.propositon2.libéraux = 5;
            event5.propositon2.militaristes = 15;
            event5.propositon2.nationalistes = 15;
            event5.propositon2.écologistes = -15;
            event5.propositon2.religieux = -15;
            event5.tags.add("guerre");
            event5.tags.add("allSeasons");
            eventList.add(event5);

            event event6 = new event();
            event6.title = "Soulèvement de la population";
            event6.textProposition1 = "Abattre les révolutionnaires";
            event6.propositon1.capitalistes = -5;
            event6.propositon1.loyalistes = 5;
            event6.propositon1.communistes = -5;
            event6.propositon1.libéraux = -5;
            event6.propositon1.militaristes = 10;
            event6.propositon1.nationalistes = 10;
            event6.propositon1.écologistes = -10;
            event6.propositon1.religieux = -10;
            event6.textProposition2 = "Ecouter les revendications";
            event6.propositon2.capitalistes = -5;
            event6.propositon2.loyalistes = -5;
            event6.propositon2.communistes = -5;
            event6.propositon2.libéraux = 5;
            event6.propositon2.militaristes = 15;
            event6.propositon2.nationalistes = 15;
            event6.propositon2.écologistes = -15;
            event6.propositon2.religieux = -15;
            event6.tags.add("guerre");
            event6.tags.add("guerre civile");
            event6.tags.add("allSeasons");
            eventList.add(event6);

            event event7 = new event();
            event7.title = "Famine";
            event7.textProposition1 = "Nourrire la population";
            event7.propositon1.capitalistes = -5;
            event7.propositon1.loyalistes = 5;
            event7.propositon1.communistes = -5;
            event7.propositon1.libéraux = -5;
            event7.propositon1.militaristes = 10;
            event7.propositon1.nationalistes = 10;
            event7.propositon1.écologistes = -10;
            event7.propositon1.religieux = -10;
            event7.textProposition2 = "Nourrire l'armée";
            event7.propositon2.capitalistes = -5;
            event7.propositon2.loyalistes = -5;
            event7.propositon2.communistes = -5;
            event7.propositon2.libéraux = 5;
            event7.propositon2.militaristes = 15;
            event7.propositon2.nationalistes = 15;
            event7.propositon2.écologistes = -15;
            event7.propositon2.religieux = -15;
            event7.tags.add("guerre");
            event7.tags.add("guerre civile");
            event7.tags.add("allSeasons");
            eventList.add(event7);

            event event8 = new event();
            event8.title = "Complot interne à l'armée";
            event8.textProposition1 = "Fusiller les traitres";
            event8.propositon1.capitalistes = -5;
            event8.propositon1.loyalistes = 5;
            event8.propositon1.communistes = -5;
            event8.propositon1.libéraux = -5;
            event8.propositon1.militaristes = 10;
            event8.propositon1.nationalistes = 10;
            event8.propositon1.écologistes = -10;
            event8.propositon1.religieux = -10;
            event8.textProposition2 = "Emprisonner les traitres";
            event8.propositon2.capitalistes = -5;
            event8.propositon2.loyalistes = -5;
            event8.propositon2.communistes = -5;
            event8.propositon2.libéraux = 5;
            event8.propositon2.militaristes = 15;
            event8.propositon2.nationalistes = 15;
            event8.propositon2.écologistes = -15;
            event8.propositon2.religieux = -15;
            event8.tags.add("guerre");
            event8.tags.add("guerre civile");
            event8.tags.add("allSeasons");
            eventList.add(event8);

            event event9 = new event();
            event9.title = "Tempete de neige";
            event9.textProposition1 = "Fournir du bois à toute la population";
            event9.propositon1.capitalistes = -5;
            event9.propositon1.loyalistes = 5;
            event9.propositon1.communistes = -5;
            event9.propositon1.libéraux = -5;
            event9.propositon1.militaristes = 10;
            event9.propositon1.nationalistes = 10;
            event9.propositon1.écologistes = -10;
            event9.propositon1.religieux = -10;
            event9.textProposition2 = "Protéger l'armée en priorité";
            event9.propositon2.capitalistes = -5;
            event9.propositon2.loyalistes = -5;
            event9.propositon2.communistes = -5;
            event9.propositon2.libéraux = 5;
            event9.propositon2.militaristes = 15;
            event9.propositon2.nationalistes = 15;
            event9.propositon2.écologistes = -15;
            event9.propositon2.religieux = -15;
            event9.tags.add("guerre");
            event9.tags.add("guerre civile");
            event9.tags.add("hiver");
            eventList.add(event9);

            event event10 = new event();
            event10.title = "L'armée est en sous nombre";
            event10.textProposition1 = "Recruter de force au sein de la population";
            event10.propositon1.capitalistes = -5;
            event10.propositon1.loyalistes = 5;
            event10.propositon1.communistes = -5;
            event10.propositon1.libéraux = -5;
            event10.propositon1.militaristes = 10;
            event10.propositon1.nationalistes = 10;
            event10.propositon1.écologistes = -10;
            event10.propositon1.religieux = -10;
            event10.textProposition2 = "Engager des mercenaires";
            event10.propositon2.capitalistes = -5;
            event10.propositon2.loyalistes = -5;
            event10.propositon2.communistes = -5;
            event10.propositon2.libéraux = 5;
            event10.propositon2.militaristes = 15;
            event10.propositon2.nationalistes = 15;
            event10.propositon2.écologistes = -15;
            event10.propositon2.religieux = -15;
            event10.tags.add("guerre");
            event10.tags.add("allSeasons");
            eventList.add(event10);

            event event11 = new event();
            event11.title = "Les munitions viennent à manquer";
            event11.textProposition1 = "Augmenter la production de munitions";
            event11.propositon1.capitalistes = -5;
            event11.propositon1.loyalistes = 5;
            event11.propositon1.communistes = -5;
            event11.propositon1.libéraux = -5;
            event11.propositon1.militaristes = 10;
            event11.propositon1.nationalistes = 10;
            event11.propositon1.écologistes = -10;
            event11.propositon1.religieux = -10;
            event11.textProposition2 = "Consturire une usine d'armement suplémentaire";
            event11.propositon2.capitalistes = -5;
            event11.propositon2.loyalistes = -5;
            event11.propositon2.communistes = -5;
            event11.propositon2.libéraux = 5;
            event11.propositon2.militaristes = 15;
            event11.propositon2.nationalistes = 15;
            event11.propositon2.écologistes = -15;
            event11.propositon2.religieux = -15;
            event11.tags.add("guerre");
            event11.tags.add("guerre civile");
            event11.tags.add("allSeasons");
            eventList.add(event11);

            event event12 = new event();
            event12.title = "Escouade coincée derrière les lignes enemis";
            event12.textProposition1 = "Aller la sauver";
            event12.propositon1.capitalistes = -5;
            event12.propositon1.loyalistes = 5;
            event12.propositon1.communistes = -5;
            event12.propositon1.libéraux = -5;
            event12.propositon1.militaristes = 10;
            event12.propositon1.nationalistes = 10;
            event12.propositon1.écologistes = -10;
            event12.propositon1.religieux = -10;
            event12.textProposition2 = "Les laisser à leur sort";
            event12.propositon2.capitalistes = -5;
            event12.propositon2.loyalistes = -5;
            event12.propositon2.communistes = -5;
            event12.propositon2.libéraux = 5;
            event12.propositon2.militaristes = 15;
            event12.propositon2.nationalistes = 15;
            event12.propositon2.écologistes = -15;
            event12.propositon2.religieux = -15;
            event12.tags.add("guerre");
            event12.tags.add("allSeasons");
            eventList.add(event12);
        }
        public ArrayList<event> getEventList(){
            return eventList;
        }

}*/
