package de.home.uni.studimarkr.client.view;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.github.gwtbootstrap.client.ui.Button;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import de.home.uni.studimarkr.client.ressources.MyRessources;

public class LoginViewImpl extends Composite implements LoginView {

	Logger logger = Logger.getLogger(this.getClass().getName());

	private static LoginViewImplUiBinder uiBinder = GWT
			.create(LoginViewImplUiBinder.class);

	interface LoginViewImplUiBinder extends UiBinder<Widget, LoginViewImpl> {
	}

	@UiField
	protected Label usernameLabel;
	@UiField
	protected Label pwLabel;
	@UiField
	protected TextBox pwTextBox;
	@UiField
	protected TextBox usernameTextBox;
	@UiField
	protected FlowPanel pwContainer;
	@UiField
	protected FlowPanel labelContainer;
	@UiField
	protected FlowPanel loginContainer;
	@UiField
	protected Button loginBtn;

	@UiHandler("loginBtn")
	void onLoginButtonClicked(ClickEvent event) {
		if (presenter != null) {
			presenter.handleLoginButtonClicked();
		}
	}

	private Presenter presenter;

	private MyRessources css;

	public LoginViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		init();
	}

	private void init() {
		css = GWT.create(MyRessources.class);
		logger.log(Level.INFO, css.loginCss().getLoginContainer());
		String name = css.loginCss().getLoginContainer();
		loginContainer.addStyleName(css.loginCss().getLoginContainer());
		// loginContainer.getElement().getStyle().setWidth(400, Unit.PX);
		// loginContainer.getElement().setAttribute("margin", "auto");
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public void setName(String loginName) {
	}

	@Override
	public String getUsername() {
		return this.usernameTextBox.getText();
	}

	@Override
	public String getPassword() {
		return this.pwTextBox.getText();
	}

}
