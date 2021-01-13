package LAB7;

public class NerfGun {
    private int ammo;
    private int displayGunID;

    public NerfGun(){
    }
    public NerfGun(int ammo){
        this.ammo=ammo;
        displayGunID++;
    }
    public void reload(int reload){
        if (ammo+reload>15){
            System.out.println("Error !! Overload Ammo.");
        }
        else {
            ammo=ammo+reload;
        }
    }
    public void fire(){
        if (ammo==0){
            System.out.println("There is no Ammo.");
        }
        else {
            ammo--;
            System.out.println("Bang !!!");
        }
    }
    public void displayNumOfAmmunition(){
        System.out.println(ammo+" Bullets Left.");
    }
    public void displayGunID(){
        System.out.println("Gun ID of This Gun is "+displayGunID);
    }

}
