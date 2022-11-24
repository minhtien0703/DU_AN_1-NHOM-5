/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewmodels;

/**
 *
 * @author Admin
 */
public class ChucVuView {

    private String Id;
    private String Ten;

    public ChucVuView() {
    }

    public ChucVuView(String Id, String Ten) {
        this.Id = Id;
        this.Ten = Ten;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    @Override
    public String toString() {
        return Ten;
    }
}
