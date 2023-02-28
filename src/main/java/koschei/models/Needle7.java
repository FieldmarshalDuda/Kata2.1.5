package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Needle7 {
private Deth8 pepsi;
public Needle7(Deth8 pepsi){
    this.pepsi=pepsi;
}
    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + pepsi.toString();
    }
}
