package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class FragmentUserProfileBioBinding extends ViewDataBinding {
  @NonNull
  public final TextView bioText;

  @NonNull
  public final LinearLayout incompleteContainer;

  @NonNull
  public final AppCompatButton incompleteEditProfileButton;

  @NonNull
  public final TextView noAboutMe;

  @NonNull
  public final AppCompatButton parentalConsentEditProfileButton;

  @NonNull
  public final LinearLayout parentalConsentRequired;

  @NonNull
  public final FrameLayout profileBioContent;

  protected FragmentUserProfileBioBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView bioText, LinearLayout incompleteContainer,
      AppCompatButton incompleteEditProfileButton, TextView noAboutMe,
      AppCompatButton parentalConsentEditProfileButton, LinearLayout parentalConsentRequired,
      FrameLayout profileBioContent) {
    super(_bindingComponent, _root, _localFieldCount);
    this.bioText = bioText;
    this.incompleteContainer = incompleteContainer;
    this.incompleteEditProfileButton = incompleteEditProfileButton;
    this.noAboutMe = noAboutMe;
    this.parentalConsentEditProfileButton = parentalConsentEditProfileButton;
    this.parentalConsentRequired = parentalConsentRequired;
    this.profileBioContent = profileBioContent;
  }

  @NonNull
  public static FragmentUserProfileBioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentUserProfileBioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentUserProfileBioBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_user_profile_bio, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUserProfileBioBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentUserProfileBioBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentUserProfileBioBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_user_profile_bio, null, false, component);
  }

  public static FragmentUserProfileBioBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentUserProfileBioBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentUserProfileBioBinding)bind(component, view, org.edx.mobile.R.layout.fragment_user_profile_bio);
  }
}
