package de.home.uni.studimarkr.client.view;

import com.github.gwtbootstrap.client.ui.Button;
import com.github.gwtbootstrap.client.ui.Label;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class LinkAddComposite extends Composite implements HasText, LinkAddView {

	private static LinkAddCompositeUiBinder uiBinder = GWT
			.create(LinkAddCompositeUiBinder.class);

	interface LinkAddCompositeUiBinder extends
			UiBinder<Widget, LinkAddComposite> {
	}

	public LinkAddComposite() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	protected Button button;
	@UiField
	protected FlowPanel container;
	@UiField
	protected Label label;

	private Presenter presenter;
	private String name;

	public LinkAddComposite(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

	@Override
	public void setText(String text) {
		button.setText(text);
	}

	@Override
	public String getText() {
		return button.getText();
	}

	@Override
	public void setLinkAddName(String name) {
		this.name = name;
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

}
