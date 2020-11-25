package cl.desafiolatam.passwordstrength.presenters;

import android.widget.Switch;

import cl.desafiolatam.passwordstrength.model.Verifier;

public class Presenter {

    IPresenterView view;
    Verifier verifier;

    public Presenter(IPresenterView view) {
        this.view = view;
        // new verifier ;
    }
    public void evaluatePass(final String password) {
        int result = verifier.evaluatePass(password);
        switch (result) {
            case Verifier.weak:
                this.view.showWeak();
                break;

            case Verifier.medium:
                this.view.showMedium();
                break;


            case  Verifier.strong:
                this.view.showStrong();
                break;


        }
    }
    }

