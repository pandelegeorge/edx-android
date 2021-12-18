package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class AuthPanelBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout llRoot;

  @NonNull
  public final AppCompatButton logIn;

  @NonNull
  public final AppCompatButton signUp;

  @NonNull
  public final View viewDivider;

  protected AuthPanelBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout llRoot, AppCompatButton logIn, AppCompatButton signUp,
      View viewDivider) {
    super(_bindingComponent, _root, _localFieldCount);
    this.llRoot = llRoot;
    this.logIn = logIn;
    this.signUp = signUp;
    this.viewDivider = viewDivider;
  }

  @NonNull
  public static AuthPanelBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AuthPanelBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AuthPanelBinding>inflate(inflater, org.edx.mobile.R.layout.auth_panel, root, attachToRoot, component);
  }

  @NonNull
  public static AuthPanelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AuthPanelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AuthPanelBinding>inflate(inflater, org.edx.mobile.R.layout.auth_panel, null, false, component);
  }

  public static AuthPanelBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static AuthPanelBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (AuthPanelBinding)bind(component, view, org.edx.mobile.R.layout.auth_panel);
  }
}
