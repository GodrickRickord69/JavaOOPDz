package task1.ui;

import task1.present.Presenter;

public interface View {
    void setPresenter(Presenter presenter);

    void start();

    void print(String text);

    String scan();
}