package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class FragmentPaymentsInfoBinding extends ViewDataBinding {
  @NonNull
  public final ImageView btnClose;

  @NonNull
  public final ImageView certificateSlice;

  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final TextView tvAuditAccessExpiresDetails;

  @NonNull
  public final TextView tvAuditAccessExpiresOn;

  @NonNull
  public final TextView tvHeader;

  @NonNull
  public final TextView tvHeaderDetail;

  protected FragmentPaymentsInfoBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView btnClose, ImageView certificateSlice,
      FrameLayout fragmentContainer, TextView tvAuditAccessExpiresDetails,
      TextView tvAuditAccessExpiresOn, TextView tvHeader, TextView tvHeaderDetail) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnClose = btnClose;
    this.certificateSlice = certificateSlice;
    this.fragmentContainer = fragmentContainer;
    this.tvAuditAccessExpiresDetails = tvAuditAccessExpiresDetails;
    this.tvAuditAccessExpiresOn = tvAuditAccessExpiresOn;
    this.tvHeader = tvHeader;
    this.tvHeaderDetail = tvHeaderDetail;
  }

  @NonNull
  public static FragmentPaymentsInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPaymentsInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPaymentsInfoBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_payments_info, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentPaymentsInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentPaymentsInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentPaymentsInfoBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_payments_info, null, false, component);
  }

  public static FragmentPaymentsInfoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentPaymentsInfoBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentPaymentsInfoBinding)bind(component, view, org.edx.mobile.R.layout.fragment_payments_info);
  }
}
