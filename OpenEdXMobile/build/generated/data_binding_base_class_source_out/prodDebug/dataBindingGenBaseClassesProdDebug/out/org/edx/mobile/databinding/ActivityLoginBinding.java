package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import org.edx.mobile.view.custom.DividerWithTextView;
import org.edx.mobile.view.custom.EdxTextInputLayout;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final CoordinatorLayout clRoot;

  @NonNull
  public final AppCompatEditText emailEt;

  @NonNull
  public final TextView endUserAgreementTv;

  @NonNull
  public final FrameLayout flLogo;

  @NonNull
  public final TextView forgotPasswordTv;

  @NonNull
  public final LinearLayout llLoginForm;

  @NonNull
  public final TextView loginBtnTv;

  @NonNull
  public final FrameLayout loginButtonLayout;

  @NonNull
  public final ImageView loginLogo;

  @NonNull
  public final ImageView loginMap;

  @NonNull
  public final LinearLayout panelLoginSocial;

  @NonNull
  public final AppCompatEditText passwordEt;

  @NonNull
  public final EdxTextInputLayout passwordWrapper;

  @NonNull
  public final ButtonProgressIndicatorBinding progress;

  @NonNull
  public final ScrollView rootView;

  @NonNull
  public final PanelSocialAuthBinding socialAuth;

  @NonNull
  public final DividerWithTextView textAlternateSignIn;

  @NonNull
  public final LinearLayout topLayout;

  @NonNull
  public final EdxTextInputLayout usernameWrapper;

  @NonNull
  public final TextView versionEnvTv;

  protected ActivityLoginBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, CoordinatorLayout clRoot, AppCompatEditText emailEt,
      TextView endUserAgreementTv, FrameLayout flLogo, TextView forgotPasswordTv,
      LinearLayout llLoginForm, TextView loginBtnTv, FrameLayout loginButtonLayout,
      ImageView loginLogo, ImageView loginMap, LinearLayout panelLoginSocial,
      AppCompatEditText passwordEt, EdxTextInputLayout passwordWrapper,
      ButtonProgressIndicatorBinding progress, ScrollView rootView,
      PanelSocialAuthBinding socialAuth, DividerWithTextView textAlternateSignIn,
      LinearLayout topLayout, EdxTextInputLayout usernameWrapper, TextView versionEnvTv) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clRoot = clRoot;
    this.emailEt = emailEt;
    this.endUserAgreementTv = endUserAgreementTv;
    this.flLogo = flLogo;
    this.forgotPasswordTv = forgotPasswordTv;
    this.llLoginForm = llLoginForm;
    this.loginBtnTv = loginBtnTv;
    this.loginButtonLayout = loginButtonLayout;
    this.loginLogo = loginLogo;
    this.loginMap = loginMap;
    this.panelLoginSocial = panelLoginSocial;
    this.passwordEt = passwordEt;
    this.passwordWrapper = passwordWrapper;
    this.progress = progress;
    setContainedBinding(this.progress);;
    this.rootView = rootView;
    this.socialAuth = socialAuth;
    setContainedBinding(this.socialAuth);;
    this.textAlternateSignIn = textAlternateSignIn;
    this.topLayout = topLayout;
    this.usernameWrapper = usernameWrapper;
    this.versionEnvTv = versionEnvTv;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLoginBinding>inflate(inflater, org.edx.mobile.R.layout.activity_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLoginBinding>inflate(inflater, org.edx.mobile.R.layout.activity_login, null, false, component);
  }

  public static ActivityLoginBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityLoginBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityLoginBinding)bind(component, view, org.edx.mobile.R.layout.activity_login);
  }
}
