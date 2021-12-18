package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import org.edx.mobile.view.custom.EdxTextInputLayout;

public abstract class ResetPasswordDialogBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatEditText emailEditText;

  @NonNull
  public final EdxTextInputLayout emailInputLayout;

  @NonNull
  public final LinearLayout llRoot;

  protected ResetPasswordDialogBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatEditText emailEditText, EdxTextInputLayout emailInputLayout,
      LinearLayout llRoot) {
    super(_bindingComponent, _root, _localFieldCount);
    this.emailEditText = emailEditText;
    this.emailInputLayout = emailInputLayout;
    this.llRoot = llRoot;
  }

  @NonNull
  public static ResetPasswordDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ResetPasswordDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ResetPasswordDialogBinding>inflate(inflater, org.edx.mobile.R.layout.reset_password_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static ResetPasswordDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ResetPasswordDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ResetPasswordDialogBinding>inflate(inflater, org.edx.mobile.R.layout.reset_password_dialog, null, false, component);
  }

  public static ResetPasswordDialogBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ResetPasswordDialogBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ResetPasswordDialogBinding)bind(component, view, org.edx.mobile.R.layout.reset_password_dialog);
  }
}
