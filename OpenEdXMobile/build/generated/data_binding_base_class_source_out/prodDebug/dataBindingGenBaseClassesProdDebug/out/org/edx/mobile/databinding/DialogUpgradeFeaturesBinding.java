package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class DialogUpgradeFeaturesBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView dialogDismiss;

  @NonNull
  public final LinearLayout dialogLayout;

  @NonNull
  public final TextView dialogTitle;

  @NonNull
  public final TextView supportNonProfit;

  protected DialogUpgradeFeaturesBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView dialogDismiss, LinearLayout dialogLayout,
      TextView dialogTitle, TextView supportNonProfit) {
    super(_bindingComponent, _root, _localFieldCount);
    this.dialogDismiss = dialogDismiss;
    this.dialogLayout = dialogLayout;
    this.dialogTitle = dialogTitle;
    this.supportNonProfit = supportNonProfit;
  }

  @NonNull
  public static DialogUpgradeFeaturesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DialogUpgradeFeaturesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DialogUpgradeFeaturesBinding>inflate(inflater, org.edx.mobile.R.layout.dialog_upgrade_features, root, attachToRoot, component);
  }

  @NonNull
  public static DialogUpgradeFeaturesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static DialogUpgradeFeaturesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<DialogUpgradeFeaturesBinding>inflate(inflater, org.edx.mobile.R.layout.dialog_upgrade_features, null, false, component);
  }

  public static DialogUpgradeFeaturesBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static DialogUpgradeFeaturesBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (DialogUpgradeFeaturesBinding)bind(component, view, org.edx.mobile.R.layout.dialog_upgrade_features);
  }
}
