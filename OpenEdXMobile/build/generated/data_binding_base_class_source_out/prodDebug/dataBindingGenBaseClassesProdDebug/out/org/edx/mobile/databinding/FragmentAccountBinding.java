package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class FragmentAccountBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout buttonLayout;

  @NonNull
  public final TextView feedbackBtn;

  @NonNull
  public final TextView logoutBtn;

  @NonNull
  public final TextView profileBtn;

  @NonNull
  public final TextView settingsBtn;

  @NonNull
  public final TextView tvVersionNo;

  protected FragmentAccountBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout buttonLayout, TextView feedbackBtn, TextView logoutBtn,
      TextView profileBtn, TextView settingsBtn, TextView tvVersionNo) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonLayout = buttonLayout;
    this.feedbackBtn = feedbackBtn;
    this.logoutBtn = logoutBtn;
    this.profileBtn = profileBtn;
    this.settingsBtn = settingsBtn;
    this.tvVersionNo = tvVersionNo;
  }

  @NonNull
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentAccountBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_account, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentAccountBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_account, null, false, component);
  }

  public static FragmentAccountBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentAccountBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentAccountBinding)bind(component, view, org.edx.mobile.R.layout.fragment_account);
  }
}
