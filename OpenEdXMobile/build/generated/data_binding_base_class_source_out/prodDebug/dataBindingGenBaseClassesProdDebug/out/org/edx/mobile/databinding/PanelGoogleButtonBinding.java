package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class PanelGoogleButtonBinding extends ViewDataBinding {
  @NonNull
  public final TextView googleTv;

  protected PanelGoogleButtonBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView googleTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.googleTv = googleTv;
  }

  @NonNull
  public static PanelGoogleButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PanelGoogleButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PanelGoogleButtonBinding>inflate(inflater, org.edx.mobile.R.layout.panel_google_button, root, attachToRoot, component);
  }

  @NonNull
  public static PanelGoogleButtonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PanelGoogleButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PanelGoogleButtonBinding>inflate(inflater, org.edx.mobile.R.layout.panel_google_button, null, false, component);
  }

  public static PanelGoogleButtonBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PanelGoogleButtonBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (PanelGoogleButtonBinding)bind(component, view, org.edx.mobile.R.layout.panel_google_button);
  }
}
