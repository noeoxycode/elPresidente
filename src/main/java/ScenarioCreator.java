import java.util.ArrayList;
//création des scénarios avec leurs tags
public class ScenarioCreator {
    public static ArrayList<Scenario> create(){
        ArrayList<Scenario> scenarioList = new ArrayList<>();

        Event event1 = new Event("Bombing", Season.All);

        Proposition proposition1Bombardement = new Proposition("Shooting down the bombers");
        proposition1Bombardement.setMilitaristes(10);
        proposition1Bombardement.setCapitalistes(6);
        proposition1Bombardement.setLibéraux(5);
        proposition1Bombardement.setCommunistes(-7);
        proposition1Bombardement.setEcologistes(-4);
        proposition1Bombardement.setMilitaristes(10);
        proposition1Bombardement.setNationalistes(-3);
        proposition1Bombardement.setLoyalistes(-3);


        Proposition proposition2Bombardement = new Proposition("Counterattack");
        proposition1Bombardement.setEcologistes(-4);
        proposition2Bombardement.setMilitaristes(10);
        proposition2Bombardement.setNationalistes(-3);
        proposition2Bombardement.setLoyalistes(3);

        event1.addProposition(proposition1Bombardement);
        event1.addProposition(proposition2Bombardement);

        Event event2 = new Event("Gas attack", Season.All);

        Proposition proposition1Gaz = new Proposition("Providing gas masks to the entire population");
        proposition1Gaz.setMilitaristes(-5);
        proposition1Gaz.setCapitalistes(-3);
        proposition1Gaz.setCommunistes(-3);
        proposition1Gaz.setEcologistes(1);
        proposition1Gaz.setNationalistes(3);

        Proposition proposition2Gaz = new Proposition("Counterattack");
        proposition2Gaz.setEcologistes(-4);
        proposition2Gaz.setMilitaristes(5);
        proposition2Gaz.setNationalistes(-3);
        proposition2Gaz.setLoyalistes(3);

        event2.addProposition(proposition1Gaz);
        event2.addProposition(proposition2Gaz);

        Event event3 = new Event("Weakness detected in enemy defenses", Season.All);

        Proposition proposition1Faiblesse = new Proposition("Break down and destroy the defenses");
        proposition1Faiblesse.setMilitaristes(10);
        proposition1Faiblesse.setCapitalistes(5);
        proposition1Faiblesse.setCommunistes(-5);
        proposition1Faiblesse.setEcologistes(-7);
        proposition1Faiblesse.setNationalistes(4);
        proposition1Faiblesse.setLibéraux(5);

        Proposition proposition2Faiblesse = new Proposition("No, it's probably a trap");
        proposition2Faiblesse.setEcologistes(4);
        proposition2Faiblesse.setMilitaristes(-5);
        proposition2Faiblesse.setNationalistes(-3);
        proposition2Faiblesse.setLoyalistes(3);
        proposition2Faiblesse.setCommunistes(3);

        event3.addProposition(proposition1Faiblesse);
        event3.addProposition(proposition2Faiblesse);

        Event event4 = new Event("Population uprising", Season.All);

        Proposition proposition1Population = new Proposition("Killing the revolutionaries");
        proposition1Population.setMilitaristes(4);
        proposition1Population.setCapitalistes(-8);
        proposition1Population.setCommunistes(-4);
        proposition1Population.setNationalistes(-7);
        proposition1Population.setLoyalistes(3);
        proposition1Population.setReligieux(-6);
        proposition1Population.setLibéraux(-5);

        Proposition proposition2Population = new Proposition("Listen to claims");
        proposition2Population.setEcologistes(4);
        proposition2Population.setMilitaristes(-4);
        proposition2Population.setNationalistes(8);
        proposition2Population.setCommunistes(8);
        proposition2Population.setCapitalistes(4);
        proposition2Population.setReligieux(8);

        event4.addProposition(proposition1Population);
        event4.addProposition(proposition2Population);


        Event event5 = new Event("Famine", Season.All);

        Proposition proposition1Famine = new Proposition("Feeding the population");
        proposition1Famine.setMilitaristes(-5);
        proposition1Famine.setCapitalistes(-4);
        proposition1Famine.setCommunistes(5);
        proposition1Famine.setNationalistes(4);
        proposition1Famine.setLoyalistes(4);
        proposition1Famine.setReligieux(4);
        proposition1Famine.setEcologistes(5);
        proposition1Famine.setLibéraux(5);

        Proposition proposition2Famine = new Proposition("Feeding the army");
        proposition2Famine.setEcologistes(-3);
        proposition2Famine.setMilitaristes(7);
        proposition2Famine.setNationalistes(-6);
        proposition2Famine.setCommunistes(-6);
        proposition2Famine.setCapitalistes(1);
        proposition2Famine.setReligieux(-5);

        event5.addProposition(proposition1Famine);
        event5.addProposition(proposition2Famine);

        Event event6 = new Event("Internal conspiracy in the army", Season.All);

        Proposition proposition1Traitre = new Proposition("Shooting traitors");
        proposition1Traitre.setMilitaristes(-9);
        proposition1Traitre.setCapitalistes(-9);
        proposition1Traitre.setCommunistes(10);
        proposition1Traitre.setNationalistes(-6);
        proposition1Traitre.setLoyalistes(-8);
        proposition1Traitre.setReligieux(-6);
        proposition1Traitre.setEcologistes(-5);
        proposition1Traitre.setLibéraux(-9);

        Proposition proposition2Traitre = new Proposition("Imprisoning traitors");
        proposition2Traitre.setEcologistes(2);
        proposition2Traitre.setMilitaristes(4);
        proposition2Traitre.setNationalistes(8);
        proposition2Traitre.setCommunistes(-9);
        proposition2Traitre.setCapitalistes(3);
        proposition2Traitre.setReligieux(2);
        proposition2Traitre.setLoyalistes(4);

        event6.addProposition(proposition1Traitre);
        event6.addProposition(proposition2Traitre);

        Event event7 = new Event("Snowstorm", Season.Winter);

        Proposition proposition1Neige = new Proposition("Helping the people");
        proposition1Neige.setMilitaristes(-2);
        proposition1Neige.setCapitalistes(-1);
        proposition1Neige.setCommunistes(3);
        proposition1Neige.setNationalistes(4);
        proposition1Neige.setLoyalistes(4);
        proposition1Neige.setReligieux(4);
        proposition1Neige.setEcologistes(-5);
        proposition1Neige.setLibéraux(0);

        Proposition proposition2Neige = new Proposition("do nothing");
        proposition2Neige.setEcologistes(1);
        proposition2Neige.setMilitaristes(2);
        proposition2Neige.setNationalistes(-4);
        proposition2Neige.setCommunistes(-4);
        proposition2Neige.setCapitalistes(-1);
        proposition2Neige.setReligieux(-2);
        proposition2Neige.setLoyalistes(-4);

        event7.addProposition(proposition1Neige);
        event7.addProposition(proposition2Neige);

        Event event8 = new Event("Drought", Season.Summer);

        Proposition proposition1secheresse = new Proposition("Helping the people");
        proposition1secheresse.setMilitaristes(-2);
        proposition1secheresse.setCapitalistes(-1);
        proposition1secheresse.setCommunistes(3);
        proposition1secheresse.setNationalistes(4);
        proposition1secheresse.setLoyalistes(4);
        proposition1secheresse.setReligieux(4);
        proposition1secheresse.setEcologistes(-5);
        proposition1secheresse.setLibéraux(0);

        Proposition proposition2secheresse = new Proposition("do nothing");
        proposition2secheresse.setEcologistes(1);
        proposition2secheresse.setMilitaristes(2);
        proposition2secheresse.setNationalistes(-4);
        proposition2secheresse.setCommunistes(-4);
        proposition2secheresse.setCapitalistes(-1);
        proposition2secheresse.setReligieux(-2);
        proposition2secheresse.setLoyalistes(-4);

        event8.addProposition(proposition1secheresse);
        event8.addProposition(proposition2secheresse);

        Event event9 = new Event("Tornado", Season.Spring);

        Proposition proposition1Tornade = new Proposition("Helping people rebuild");
        proposition1Tornade.setMilitaristes(1);
        proposition1Tornade.setCapitalistes(-3);
        proposition1Tornade.setCommunistes(3);
        proposition1Tornade.setNationalistes(4);
        proposition1Tornade.setLoyalistes(4);
        proposition1Tornade.setReligieux(4);
        proposition1Tornade.setEcologistes(4);
        proposition1Tornade.setLibéraux(1);

        Proposition proposition2Tornade = new Proposition("Don't do much");
        proposition2Tornade.setEcologistes(-3);
        proposition2Tornade.setMilitaristes(2);
        proposition2Tornade.setNationalistes(-4);
        proposition2Tornade.setCommunistes(-4);
        proposition2Tornade.setCapitalistes(3);
        proposition2Tornade.setReligieux(-2);
        proposition2Tornade.setLoyalistes(-4);

        event9.addProposition(proposition1Tornade);
        event9.addProposition(proposition2Tornade);


        Event event10 = new Event("Pandemic", Season.All);

        Proposition proposition1Pandemie = new Proposition("Containment");
        proposition1Pandemie.setCapitalistes(-4);
        proposition1Pandemie.setCommunistes(-2);
        proposition1Pandemie.setNationalistes(4);
        proposition1Pandemie.setLoyalistes(4);
        proposition1Pandemie.setReligieux(4);
        proposition1Pandemie.setEcologistes(5);
        proposition1Pandemie.setLibéraux(-3);


        Proposition proposition2Pandémie = new Proposition("do nothing");
        proposition2Pandémie.setCapitalistes(4);
        proposition2Pandémie.setCommunistes(-2);
        proposition2Pandémie.setNationalistes(-4);
        proposition2Pandémie.setLoyalistes(-4);
        proposition2Pandémie.setReligieux(-4);
        proposition2Pandémie.setEcologistes(-5);
        proposition2Pandémie.setLibéraux(2);


        event10.addProposition(proposition1Pandemie);
        event10.addProposition(proposition2Pandémie);

        Event event11 = new Event("New variant", Season.All);

        Proposition proposition1NouveauVariant = new Proposition("New vaccine research");
        proposition1NouveauVariant.setCapitalistes(-2);
        proposition1NouveauVariant.setCommunistes(2);
        proposition1NouveauVariant.setNationalistes(6);
        proposition1NouveauVariant.setLoyalistes(4);
        proposition1NouveauVariant.setReligieux(4);
        proposition1NouveauVariant.setEcologistes(1);
        proposition1NouveauVariant.setLibéraux(7);


        Proposition proposition2NouveauVariant = new Proposition("do nothing");
        proposition2NouveauVariant.setCapitalistes(6);
        proposition2NouveauVariant.setCommunistes(-5);
        proposition2NouveauVariant.setNationalistes(-5);
        proposition2NouveauVariant.setLoyalistes(-5);
        proposition2NouveauVariant.setReligieux(-5);
        proposition2NouveauVariant.setEcologistes(-7);
        proposition2NouveauVariant.setLibéraux(-5);


        event11.addProposition(proposition1NouveauVariant);
        event11.addProposition(proposition2NouveauVariant);

        Event event12 = new Event("Financial crisis", Season.All);

        Proposition proposition1CriseFinancière = new Proposition("Helping the people");
        proposition1CriseFinancière.setCapitalistes(-3);
        proposition1CriseFinancière.setCommunistes(-3);
        proposition1CriseFinancière.setNationalistes(4);
        proposition1CriseFinancière.setLoyalistes(4);
        proposition1CriseFinancière.setReligieux(4);
        proposition1CriseFinancière.setEcologistes(4);
        proposition1CriseFinancière.setLibéraux(3);


        Proposition proposition2CriseFinancière = new Proposition("Keep the money for later");
        proposition2CriseFinancière.setCapitalistes(4);
        proposition2CriseFinancière.setCommunistes(3);
        proposition2CriseFinancière.setNationalistes(-8);
        proposition2CriseFinancière.setLoyalistes(-4);
        proposition2CriseFinancière.setReligieux(-4);
        proposition2CriseFinancière.setEcologistes(-4);
        proposition2CriseFinancière.setLibéraux(-5);

        event12.addProposition(proposition1CriseFinancière);
        event12.addProposition(proposition2CriseFinancière);

        Event event13 = new Event("2 new vaccines", Season.All);

        Proposition proposition1Vaccin = new Proposition("Vaccine 1");
        proposition1Vaccin.setCapitalistes(-8);
        proposition1Vaccin.setCommunistes(-7);
        proposition1Vaccin.setNationalistes(-8);
        proposition1Vaccin.setLoyalistes(-9);
        proposition1Vaccin.setReligieux(-8);
        proposition1Vaccin.setEcologistes(-9);
        proposition1Vaccin.setLibéraux(-9);


        Proposition proposition2Vaccin = new Proposition("Vaccine 2");
        proposition2Vaccin.setCapitalistes(8);
        proposition2Vaccin.setCommunistes(8);
        proposition2Vaccin.setNationalistes(8);
        proposition2Vaccin.setLoyalistes(8);
        proposition2Vaccin.setReligieux(8);
        proposition2Vaccin.setEcologistes(8);
        proposition2Vaccin.setLibéraux(8);


        event13.addProposition(proposition1Vaccin);
        event13.addProposition(proposition2Vaccin);

        Event event14 = new Event("Strike", Season.All);

        Proposition proposition1Greve = new Proposition("Call the police");
        proposition1Greve.setCapitalistes(-1);
        proposition1Greve.setCommunistes(-1);
        proposition1Greve.setNationalistes(-1);
        proposition1Greve.setLoyalistes(-2);
        proposition1Greve.setReligieux(-2);
        proposition1Greve.setLibéraux(-6);
        proposition1Greve.setMilitaristes(4);


        Proposition proposition2Greve = new Proposition("Listen to the public");
        proposition2Greve.setCapitalistes(3);
        proposition2Greve.setCommunistes(3);
        proposition2Greve.setNationalistes(8);
        proposition2Greve.setLoyalistes(7);
        proposition2Greve.setReligieux(3);
        proposition2Greve.setLibéraux(6);
        proposition2Greve.setMilitaristes(-4);


        event14.addProposition(proposition1Greve);
        event14.addProposition(proposition2Greve);

        Event event15 = new Event("Noel", Season.Winter);

        Proposition proposition1Noel = new Proposition("Decorate the country");
        proposition1Noel.setCapitalistes(5);
        proposition1Noel.setCommunistes(5);
        proposition1Noel.setNationalistes(7);
        proposition1Noel.setLoyalistes(5);
        proposition1Noel.setReligieux(10);
        proposition1Noel.setLibéraux(10);
        proposition1Noel.setMilitaristes(8);
        proposition1Noel.setEcologistes(-6);


        Proposition proposition2Noel = new Proposition("do nothing");
        proposition2Noel.setCapitalistes(-3);
        proposition2Noel.setCommunistes(-3);
        proposition2Noel.setNationalistes(-4);
        proposition2Noel.setLoyalistes(-2);
        proposition2Noel.setReligieux(-10);
        proposition2Noel.setLibéraux(-5);
        proposition2Noel.setMilitaristes(-4);
        proposition2Noel.setEcologistes(4);


        event15.addProposition(proposition1Noel);
        event15.addProposition(proposition2Noel);

        Event event16 = new Event("Halloween", Season.Fall);

        Proposition proposition1Halloween = new Proposition("Decorate the country");
        proposition1Halloween.setCapitalistes(5);
        proposition1Halloween.setCommunistes(5);
        proposition1Halloween.setNationalistes(7);
        proposition1Halloween.setLoyalistes(5);
        proposition1Halloween.setReligieux(10);
        proposition1Halloween.setLibéraux(10);
        proposition1Halloween.setMilitaristes(8);
        proposition1Halloween.setEcologistes(-6);


        Proposition proposition2Halloween = new Proposition("do nothing");
        proposition2Halloween.setCapitalistes(-3);
        proposition2Halloween.setCommunistes(-3);
        proposition2Halloween.setNationalistes(-4);
        proposition2Halloween.setLoyalistes(-2);
        proposition2Halloween.setReligieux(-10);
        proposition2Halloween.setLibéraux(-5);
        proposition2Halloween.setMilitaristes(-4);
        proposition2Halloween.setEcologistes(4);


        event16.addProposition(proposition1Halloween);
        event16.addProposition(proposition2Halloween);

        Event event20 = new Event("New technology", Season.All);

        Proposition proposition1Techno = new Proposition("Using it's new technology for you");
        proposition1Techno.setCapitalistes(3);
        proposition1Techno.setCommunistes(3);
        proposition1Techno.setNationalistes(-5);
        proposition1Techno.setLoyalistes(-5);
        proposition1Techno.setReligieux(-5);
        proposition1Techno.setLibéraux(-5);
        proposition1Techno.setMilitaristes(4);
        proposition1Techno.setEcologistes(-4);


        Proposition proposition2Techno = new Proposition("Using it's new technology for the population");
        proposition2Techno.setCapitalistes(3);
        proposition2Techno.setCommunistes(3);
        proposition2Techno.setNationalistes(4);
        proposition2Techno.setLoyalistes(2);
        proposition2Techno.setReligieux(3);
        proposition2Techno.setLibéraux(5);
        proposition2Techno.setMilitaristes(-4);
        proposition2Techno.setEcologistes(5);


        event20.addProposition(proposition1Techno);
        event20.addProposition(proposition2Techno);

        Event event21 = new Event("Purchase of protective barrier against the cold", Season.Winter);

        Proposition proposition1barrière = new Proposition("Giving to the rich");
        proposition1barrière.setCapitalistes(-7);
        proposition1barrière.setCommunistes(-6);
        proposition1barrière.setNationalistes(-7);
        proposition1barrière.setLoyalistes(-8);
        proposition1barrière.setReligieux(-5);
        proposition1barrière.setLibéraux(-5);
        proposition1barrière.setMilitaristes(1);
        proposition1barrière.setEcologistes(-7);


        Proposition proposition2barrière = new Proposition("Giving to the poor");
        proposition2barrière.setCapitalistes(8);
        proposition2barrière.setCommunistes(7);
        proposition2barrière.setNationalistes(7);
        proposition2barrière.setLoyalistes(5);
        proposition2barrière.setReligieux(3);
        proposition2barrière.setLibéraux(5);
        proposition2barrière.setMilitaristes(4);
        proposition2barrière.setEcologistes(5);


        event21.addProposition(proposition1barrière);
        event21.addProposition(proposition2barrière);

        Event event22 = new Event("New World War", Season.All);

        Proposition proposition1alliance = new Proposition("Allying with the United State");
        proposition1alliance.setCapitalistes(9);
        proposition1alliance.setCommunistes(-10);
        proposition1alliance.setNationalistes(8);
        proposition1alliance.setLoyalistes(5);
        proposition1alliance.setReligieux(1);
        proposition1alliance.setLibéraux(5);
        proposition1alliance.setMilitaristes(7);
        proposition1alliance.setEcologistes(1);


        Proposition proposition2alliance = new Proposition("Allying with Russia");
        proposition2alliance.setCapitalistes(-10);
        proposition2alliance.setCommunistes(10);
        proposition2alliance.setNationalistes(-6);
        proposition2alliance.setLoyalistes(-6);
        proposition2alliance.setReligieux(-1);
        proposition2alliance.setLibéraux(-8);
        proposition2alliance.setMilitaristes(-10);
        proposition2alliance.setEcologistes(-1);


        event22.addProposition(proposition1alliance);
        event22.addProposition(proposition2alliance);

        Event event23 = new Event("Space conquest", Season.All);

        Proposition proposition1espace = new Proposition("Investing in space conquest");
        proposition1espace.setCapitalistes(9);
        proposition1espace.setCommunistes(9);
        proposition1espace.setNationalistes(-5);
        proposition1espace.setLoyalistes(-5);
        proposition1espace.setReligieux(-3);
        proposition1espace.setLibéraux(6);
        proposition1espace.setMilitaristes(-6);
        proposition1espace.setEcologistes(-10);


        Proposition proposition2espace = new Proposition("Focus on the Earth first");
        proposition2espace.setCapitalistes(-8);
        proposition2espace.setCommunistes(-8);
        proposition2espace.setNationalistes(6);
        proposition2espace.setLoyalistes(5);
        proposition2espace.setReligieux(1);
        proposition2espace.setLibéraux(6);
        proposition2espace.setMilitaristes(7);
        proposition2espace.setEcologistes(10);


        event23.addProposition(proposition1espace);
        event23.addProposition(proposition2espace);

        Event event24 = new Event("Creating an Artificial Island", Season.Summer);

        Proposition proposition1ile = new Proposition("For Tourism");
        proposition1ile.setCapitalistes(9);
        proposition1ile.setCommunistes(-9);
        proposition1ile.setNationalistes(3);
        proposition1ile.setLoyalistes(5);
        proposition1ile.setReligieux(-8);
        proposition1ile.setLibéraux(2);
        proposition1ile.setMilitaristes(-4);
        proposition1ile.setEcologistes(-10);


        Proposition proposition2ile = new Proposition("For the population");
        proposition2ile.setCapitalistes(-8);
        proposition2ile.setCommunistes(5);
        proposition2ile.setNationalistes(6);
        proposition2ile.setLoyalistes(5);
        proposition2ile.setReligieux(1);
        proposition2ile.setLibéraux(6);
        proposition2ile.setMilitaristes(1);
        proposition2ile.setEcologistes(-10);


        event24.addProposition(proposition1ile);
        event24.addProposition(proposition2ile);

        Event event25 = new Event("The Earth is in danger", Season.All);

        Proposition proposition1Terre = new Proposition("Doing as usual, others will take care of it");
        proposition1Terre.setCapitalistes(9);
        proposition1Terre.setCommunistes(9);
        proposition1Terre.setNationalistes(-7);
        proposition1Terre.setLoyalistes(-5);
        proposition1Terre.setReligieux(-8);
        proposition1Terre.setLibéraux(-7);
        proposition1Terre.setMilitaristes(-5);
        proposition1Terre.setEcologistes(-10);


        Proposition proposition2Terre = new Proposition("Use all means to save our planet");
        proposition2Terre.setCapitalistes(-8);
        proposition2Terre.setCommunistes(-5);
        proposition2Terre.setNationalistes(9);
        proposition2Terre.setLoyalistes(9);
        proposition2Terre.setReligieux(7);
        proposition2Terre.setLibéraux(6);
        proposition2Terre.setMilitaristes(7);
        proposition2Terre.setEcologistes(10);


        event25.addProposition(proposition1Terre);
        event25.addProposition(proposition2Terre);

        Event event26 = new Event("New weapon of mass destruction", Season.All);

        Proposition proposition1Arme = new Proposition("Buying, it can be used");
        proposition1Arme.setCapitalistes(9);
        proposition1Arme.setCommunistes(9);
        proposition1Arme.setNationalistes(-7);
        proposition1Arme.setLoyalistes(-5);
        proposition1Arme.setReligieux(-8);
        proposition1Arme.setLibéraux(-7);
        proposition1Arme.setMilitaristes(10);
        proposition1Arme.setEcologistes(-10);


        Proposition proposition2Arme = new Proposition("No need");
        proposition2Arme.setCapitalistes(-8);
        proposition2Arme.setCommunistes(-9);
        proposition2Arme.setNationalistes(9);
        proposition2Arme.setLoyalistes(9);
        proposition2Arme.setReligieux(7);
        proposition2Arme.setLibéraux(6);
        proposition2Arme.setMilitaristes(-10);
        proposition2Arme.setEcologistes(10);


        event26.addProposition(proposition1Arme);
        event26.addProposition(proposition2Arme);


        Scenario scenario0 = new Scenario("Sandbox");
        scenarioList.add(scenario0);
        scenario0.addEvent(event1);
        scenario0.addEvent(event2);
        scenario0.addEvent(event3);
        scenario0.addEvent(event4);
        scenario0.addEvent(event5);
        scenario0.addEvent(event6);
        scenario0.addEvent(event7);
        scenario0.addEvent(event8);
        scenario0.addEvent(event9);
        scenario0.addEvent(event10);
        scenario0.addEvent(event11);
        scenario0.addEvent(event12);
        scenario0.addEvent(event13);
        scenario0.addEvent(event14);
        scenario0.addEvent(event15);
        scenario0.addEvent(event16);
        scenario0.addEvent(event20);
        scenario0.addEvent(event21);
        scenario0.addEvent(event22);
        scenario0.addEvent(event23);
        scenario0.addEvent(event24);
        scenario0.addEvent(event25);
        scenario0.addEvent(event26);

        Scenario scenario1 = new Scenario("War");
        scenarioList.add(scenario1);
        scenario1.addEvent(event1);
        scenario1.addEvent(event2);
        scenario1.addEvent(event3);
        scenario1.addEvent(event4);
        scenario1.addEvent(event5);
        scenario1.addEvent(event6);
        scenario1.addEvent(event7);
        scenario1.addEvent(event8);
        scenario1.addEvent(event9);

        Scenario scenario2 = new Scenario("Covid-19");
        scenarioList.add(scenario2);
        scenario2.addEvent(event7);
        scenario2.addEvent(event8);
        scenario2.addEvent(event9);
        scenario2.addEvent(event10);
        scenario2.addEvent(event11);
        scenario2.addEvent(event12);
        scenario2.addEvent(event13);
        scenario2.addEvent(event14);
        scenario2.addEvent(event15);
        scenario2.addEvent(event16);

        Scenario scenario3 = new Scenario("Future");
        scenarioList.add(scenario3);
        scenario3.addEvent(event7);
        scenario3.addEvent(event8);
        scenario3.addEvent(event9);
        scenario3.addEvent(event20);
        scenario3.addEvent(event21);
        scenario3.addEvent(event22);
        scenario3.addEvent(event23);
        scenario3.addEvent(event24);
        scenario3.addEvent(event25);
        scenario3.addEvent(event26);
        scenario3.addEvent(event15);
        scenario3.addEvent(event16);

        return scenarioList;
    }
}
