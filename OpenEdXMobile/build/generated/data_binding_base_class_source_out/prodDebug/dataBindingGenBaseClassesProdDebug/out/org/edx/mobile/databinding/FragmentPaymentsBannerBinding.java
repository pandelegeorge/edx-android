package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import org.edx.mobile.view.custom.IconImageViewXml;

public abstract class FragmentPaymentsBannerBinding extends ViewDataBinding {
  @NonNull
  public final View divider;

  @NonNull
  public final IconImageViewXml info;

  @NonNull
  public final LinearLayout llUpgradeButton;

  @NonNull
  public final TextView tvUpgradePrice;

  @NonNull
  public final TextView upgradeBannerDescription;

  @NonNull
  public final ConstraintLayout upgradeToVerifiedFooter;

  protected FragmentPaymentsBannerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, View divider, IconImageViewXml info, LinearLayout llUpgradeButton,
      TextView tvUpgradePrice, TextView upgradeBannerDescription,
      ConstraintLayout upgradeToVerifiedFooter) {
    super(_bindingComponent, _root, _localFieldCount);
    this.divider = divider;
    this.info = info;
    this.llUpgradeButton = llUpgradeButton;
    this.tvUpgradePrice = tvUpgradePrice;
    this.upgradeBannerDescription = upgradeBannerDescription;
    this.upgradeToVerifiedFooter = upgradeToVerifiedFooter;
  }

  @NonNull
  public static FragmentPaymentsBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPaymentsBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPaymentsBannerBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_payments_banner, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPaymentsBannerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPaymentsBannerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPaymentsBannerBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_payments_banner, null, false, component);
  }

  public static FragmentPaymentsBannerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentPaymentsBannerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentPaymentsBannerBinding)bind(component, view, org.edx.mobile.R.layout.fragment_payments_banner);
  }
}
