package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class PanelSocialAuthBinding extends ViewDataBinding {
  @NonNull
  public final PanelFacebookButtonBinding facebookButton;

  @NonNull
  public final PanelGoogleButtonBinding googleButton;

  @NonNull
  public final PanelMicrosoftButtonBinding microsoftButton;

  @NonNull
  public final ConstraintLayout panelSocialLayout;

  @NonNull
  public final View viewPadding;

  protected PanelSocialAuthBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, PanelFacebookButtonBinding facebookButton,
      PanelGoogleButtonBinding googleButton, PanelMicrosoftButtonBinding microsoftButton,
      ConstraintLayout panelSocialLayout, View viewPadding) {
    super(_bindingComponent, _root, _localFieldCount);
    this.facebookButton = facebookButton;
    setContainedBinding(this.facebookButton);;
    this.googleButton = googleButton;
    setContainedBinding(this.googleButton);;
    this.microsoftButton = microsoftButton;
    setContainedBinding(this.microsoftButton);;
    this.panelSocialLayout = panelSocialLayout;
    this.viewPadding = viewPadding;
  }

  @NonNull
  public static PanelSocialAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PanelSocialAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PanelSocialAuthBinding>inflate(inflater, org.edx.mobile.R.layout.panel_social_auth, root, attachToRoot, component);
  }

  @NonNull
  public static PanelSocialAuthBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PanelSocialAuthBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PanelSocialAuthBinding>inflate(inflater, org.edx.mobile.R.layout.panel_social_auth, null, false, component);
  }

  public static PanelSocialAuthBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PanelSocialAuthBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (PanelSocialAuthBinding)bind(component, view, org.edx.mobile.R.layout.panel_social_auth);
  }
}
