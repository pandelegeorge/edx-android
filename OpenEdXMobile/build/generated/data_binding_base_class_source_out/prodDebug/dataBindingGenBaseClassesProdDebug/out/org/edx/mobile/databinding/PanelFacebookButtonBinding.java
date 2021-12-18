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

public abstract class PanelFacebookButtonBinding extends ViewDataBinding {
  @NonNull
  public final TextView fbTv;

  @NonNull
  public final ImageView imgviewFacebook;

  protected PanelFacebookButtonBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView fbTv, ImageView imgviewFacebook) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fbTv = fbTv;
    this.imgviewFacebook = imgviewFacebook;
  }

  @NonNull
  public static PanelFacebookButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PanelFacebookButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PanelFacebookButtonBinding>inflate(inflater, org.edx.mobile.R.layout.panel_facebook_button, root, attachToRoot, component);
  }

  @NonNull
  public static PanelFacebookButtonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PanelFacebookButtonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PanelFacebookButtonBinding>inflate(inflater, org.edx.mobile.R.layout.panel_facebook_button, null, false, component);
  }

  public static PanelFacebookButtonBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PanelFacebookButtonBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (PanelFacebookButtonBinding)bind(component, view, org.edx.mobile.R.layout.panel_facebook_button);
  }
}
