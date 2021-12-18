package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import de.hdodenhof.circleimageview.CircleImageView;

public abstract class FragmentUserProfileBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ContentErrorBinding contentError;

  @NonNull
  public final LoadingIndicatorBinding contentLoadingIndicator;

  @NonNull
  public final LinearLayout languageContainer;

  @NonNull
  public final TextView languageText;

  @NonNull
  public final LinearLayout locationContainer;

  @NonNull
  public final TextView locationText;

  @NonNull
  public final TextView nameText;

  @NonNull
  public final FrameLayout profileBody;

  @NonNull
  public final LinearLayout profileBodyContent;

  @NonNull
  public final LinearLayout profileHeader;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final ViewPager2 profileSectionPager;

  @NonNull
  public final TabLayout profileSectionTabs;

  @NonNull
  public final TextView sharingLimited;

  protected FragmentUserProfileBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, ContentErrorBinding contentError,
      LoadingIndicatorBinding contentLoadingIndicator, LinearLayout languageContainer,
      TextView languageText, LinearLayout locationContainer, TextView locationText,
      TextView nameText, FrameLayout profileBody, LinearLayout profileBodyContent,
      LinearLayout profileHeader, CircleImageView profileImage, ViewPager2 profileSectionPager,
      TabLayout profileSectionTabs, TextView sharingLimited) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.contentError = contentError;
    setContainedBinding(this.contentError);;
    this.contentLoadingIndicator = contentLoadingIndicator;
    setContainedBinding(this.contentLoadingIndicator);;
    this.languageContainer = languageContainer;
    this.languageText = languageText;
    this.locationContainer = locationContainer;
    this.locationText = locationText;
    this.nameText = nameText;
    this.profileBody = profileBody;
    this.profileBodyContent = profileBodyContent;
    this.profileHeader = profileHeader;
    this.profileImage = profileImage;
    this.profileSectionPager = profileSectionPager;
    this.profileSectionTabs = profileSectionTabs;
    this.sharingLimited = sharingLimited;
  }

  @NonNull
  public static FragmentUserProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentUserProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentUserProfileBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_user_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentUserProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentUserProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentUserProfileBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_user_profile, null, false, component);
  }

  public static FragmentUserProfileBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentUserProfileBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentUserProfileBinding)bind(component, view, org.edx.mobile.R.layout.fragment_user_profile);
  }
}
