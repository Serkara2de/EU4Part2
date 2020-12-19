package a_review.week13;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String BA, PO, SM;
    public ArrayList<Tester> testers;
    public ArrayList<Developer> developers;

    public ScrumTeam(String BA, String PO, String SM) {
        this.BA = BA;
        this.PO = PO;
        this.SM = SM;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }

    public void hireTester(Tester tester){
        testers.add(tester);
    }

    public void hireTester(Tester[] tester){
       //this.testers.addAll(Arrays.asList(tester));
        for( Tester eachTester : tester) {
            hireTester(eachTester);
        }


    }

    public void hireDeveloper(Developer developer){
        developers.add(developer);
    }

    public void hireDeveloper(Developer[] developer){
        //this.developers.addAll(Arrays.asList(developer));
        for(Developer eachDeveloper : developer){
            hireDeveloper(eachDeveloper);
        }

    }

    public void terminateTester(String ID){
       // testers.removeIf(p -> p.ID.equals(ID));

        Tester tester = null;
        for(Tester each: testers){
            if(each.ID.equals(ID)){
                tester= each;
            }
        }
        testers.remove(tester);
    }

    public void terminateDeveloper(String ID){
        // developers.removeIf(p -> p.ID.equals(ID));

        Developer developer = null;
        for(Developer each: developers){
            if(each.ID.equals(ID)){
                developer= each;
            }
        }
        testers.remove(developer);
    }

    public void dailyStandUp(){
        System.out.println(SM + " is doing daily stand up meeting");
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "BA='" + BA + '\'' +
                ", PO='" + PO + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                '}';
    }

    /*
    ScrumTeam:
        attributes:
            BA, PO, SM (String)
            ArrayList<Tester>
            ArrayList<Developer>
     */
}
