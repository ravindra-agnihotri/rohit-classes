package excercise.StaticAndNonStatic;

import static excercise.StaticAndNonStatic.PuneArea.*;
import static excercise.StaticAndNonStatic.PuneCompany.*;
import static excercise.StaticAndNonStatic.PuneFood.*;

public class Pune {
   public static void main(String[] args) {
        PuneFood pf = new PuneFood();
        pf.idli();
        pf.dosa("mild");
        pf.wada();
        pf.uttappa(3);
        pizza();
        burger();
        sandwich("superhot");
        roll(4);
        fries("supercold", "baskwas");
        momos(5, 6);

        PuneArea pa = new PuneArea();
        pa.kothrud();
        pa.warje("Humid");
        pa.magarpatta();
        pa.KP(5000);
        hinjewadi();
        pimpri();
        sangavi("rainy");
        wakad(4000);
        dhayari("cloudy","storm");
        katraj(100,200);

        PuneCompany pc = new PuneCompany();
        pc.xento();
        pc.tcs("very good");
        pc.hcl();
        pc.dell(30);
        capgemini();
        cognizant();
        infosys("superb");
        persistent(40);
        vodafone("okok","average");
        wipro(50,60);



    }

//    public static void main(String[] args) {
//        PuneArea puneArea= new PuneArea("ravindra");
//        System.out.println(puneArea.getTutor());
//
//    }
}
