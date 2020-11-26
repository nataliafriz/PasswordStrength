package cl.desafiolatam.passwordstrength.presenters;

import cl.desafiolatam.passwordstrength.model.Verifier;

public class Presenter {

    IPresenterView view;
    Verifier verifier;
    public Presenter(IPresenterView view){
        this.view=view;
        verifier=new Verifier();
    }
    public void evaluatePass(final String pass){
        int res=verifier.evaluatePass(pass);
        switch(res){
            case  Verifier.weak:this.view.showWeak();
                break;
            case Verifier.medium:this.view.showMedium();
                break;
            case Verifier.strong:this.view.showStrong();
                break;


        }
    }

}