package de.home.uni.studimarkr.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class DashboardViewImpl extends Composite implements DashboardView {

	private static DashboardViewImplUiBinder uiBinder = GWT
			.create(DashboardViewImplUiBinder.class);

	interface DashboardViewImplUiBinder extends
			UiBinder<Widget, DashboardViewImpl> {
	}

	public DashboardViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));

	}

	private Presenter presenter;
	private String name;

	public DashboardViewImpl(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setName(String dashboardName) {
		this.name = dashboardName;
	}

	@Override
	public void setPresenter(Presenter presenter) {
		this.presenter = presenter;
	}

}
