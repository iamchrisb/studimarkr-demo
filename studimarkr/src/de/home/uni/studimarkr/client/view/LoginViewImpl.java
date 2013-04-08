package de.home.uni.studimarkr.client.view;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import de.home.uni.studimarkr.client.MyRessources;

public class LoginViewImpl extends Composite implements LoginView {
	
	Logger logger = Logger.getLogger(this.getClass().getName());

	private static LoginViewImplUiBinder uiBinder = GWT.create(LoginViewImplUiBinder.class);

	interface LoginViewImplUiBinder extends UiBinder<Widget, LoginViewImpl> { }
	
	@UiField Label usernameLabel;
	@UiField Label pwLabel;
	@UiField TextBox pwTextBox;
	@UiField TextBox usernameTextBox;
	@UiField FlowPanel pwContainer;
	@UiField FlowPanel labelContainer;
	@UiField Label clickLabel;
	@UiField FlowPanel loginContainer;

	private String name;
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
//		loginContainer.getElement().getStyle().setWidth(400, Unit.PX);
//		loginContainer.getElement().setAttribute("margin", "auto");
		
		clickLabel.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				DialogBox alert = new DialogBox();
				alert.setTitle("Label Handler");
				alert.setText("clicked");
				alert.show();
			}
		});
	}

	public Label getUsernameLabel() {
		return usernameLabel;
	}

	public void setUsernameLabel(Label usernameLabel) {
		this.usernameLabel = usernameLabel;
	}

	public Label getPwLabel() {
		return pwLabel;
	}

	public void setPwLabel(Label pwLabel) {
		this.pwLabel = pwLabel;
	}

	public TextBox getPwTextBox() {
		return pwTextBox;
	}

	public void setPwTextBox(TextBox pwTextBox) {
		this.pwTextBox = pwTextBox;
	}

	public TextBox getUsernameTextBox() {
		return usernameTextBox;
	}

	public void setUsernameTextBox(TextBox usernameTextBox) {
		this.usernameTextBox = usernameTextBox;
	}

	public FlowPanel getPwContainer() {
		return pwContainer;
	}

	public void setPwContainer(FlowPanel pwContainer) {
		this.pwContainer = pwContainer;
	}

	public FlowPanel getLabelContainer() {
		return labelContainer;
	}

	public void setLabelContainer(FlowPanel labelContainer) {
		this.labelContainer = labelContainer;
	}

	public Label getClickLabel() {
		return clickLabel;
	}

	public void setClickLabel(Label clickLabel) {
		this.clickLabel = clickLabel;
	}

	@Override
	public void setName(String loginName) {
		this.name = loginName;
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}
	
}