package Classes;

import Interfaces.iReturnOrder;
/** @class Акционного клиента */
public class PromotionalClient extends Actor implements iReturnOrder{
    /** Номер акции */
    static int shareNumber;
    /**
     * Конструктор акционного клиента
     * @param name
     * @param shareNumber
     */
    public PromotionalClient(String name, int shareNumber) {
        super(name);
        this.shareNumber = shareNumber;
    }

    /** Метод возвращающий имя клиента */
    @Override
    public String getName() {
        return super.name;
    }
    /**Метод возвращает результат созданого заказа */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**Метод возвращает результат полученного заказа */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;        
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;      
    }
    /** Метод возврата товара */
    @Override
    public void purchasceReturn(Actor actor) {
        System.out.println(actor.getName() + " клиент оформил возврат товара!");
        goodsCheck();
        productApproved(actor);
        

    }
    /** Метод проверка товара */
    @Override
    public boolean goodsCheck() {
        System.out.println("Товар отправлен на проверку");
        return goodsCheck = true;
    }
    /** Метод одобрения возврата  */
    @Override
    public void productApproved(Actor actor) {
        if (goodsCheck == true) {
            System.out.println("Товар принят к возврату. Деньги за товар отправлены клиенту: " + actor.getName());

        }

    }
    
}
