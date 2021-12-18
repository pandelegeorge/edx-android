package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class PanelMicrosoftButtonBinding extends ViewDataBinding {
  @NonNull
  public final ImageView ivMicrosoft;

  @NonNull
  public final TextView tvMicrosoft;

  protected PanelMicrosoftButtonBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView ivMicrosoft, TextView tvMicrosoft) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivMicrosoft = ivMicrosoft;
    this.tvMicrosoft = tvMicrosoft;
  }

  @NonNull
  public static PanelMicrosoftButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PanelMicrosoftButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PanelMicrosoftButtonBinding>inflate(inflater, org.edx.mobile.R.layout.panel_microsoft_button, root, attachToRoot, component);
  }

  @NonNull
  public static PanelMicrosoftButtonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PanelMicrosoftButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PanelMicrosoftButtonBinding>inflate(inflater, org.edx.mobile.R.layout.panel_microsoft_button, null, false, component);
  }

  public static PanelMicrosoftButtonBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PanelMicrosoftButtonBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (PanelMicrosoftButtonBinding)bind(component, view, org.edx.mobile.R.layout.panel_microsoft_button);
  }
}
