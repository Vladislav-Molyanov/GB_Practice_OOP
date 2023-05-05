import Classes.Market;
import Classes.OrdinaryClien;
import Classes.PromotionalClient;
import Classes.VipClient;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        OrdinaryClien client1 =  new OrdinaryClien("Boris");
        OrdinaryClien client2 = new OrdinaryClien("Masha");
        VipClient vipClient1 = new VipClient("Elena", 1040);
        PromotionalClient promClient = new PromotionalClient("Dmitriy", 322);
        market.acceptToMatket(client2);
        market.acceptToMatket(client1);
        market.acceptToMatket(vipClient1);
        market.acceptToMatket(promClient);
        market.update();
        client1.purchasceReturn(client1);
        vipClient1.purchasceReturn(vipClient1);
        promClient.purchasceReturn(promClient);
        
    
    }
}
