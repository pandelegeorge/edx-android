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
import androidx.viewpager2.widget.ViewPager2;
import com.joanzapata.iconify.widget.IconButton;

public abstract class FragmentWhatsNewBinding extends ViewDataBinding {
  @NonNull
  public final IconButton closeBtn;

  @NonNull
  public final AppCompatButton doneBtn;

  @NonNull
  public final FrameLayout flBottomBar;

  @NonNull
  public final FrameLayout flTopBar;

  @NonNull
  public final FrameLayout indicatorContainer;

  @NonNull
  public final LinearLayout llRoot;

  @NonNull
  public final TextView screenTitle;

  @NonNull
  public final ViewPager2 viewPager2;

  protected FragmentWhatsNewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, IconButton closeBtn, AppCompatButton doneBtn, FrameLayout flBottomBar,
      FrameLayout flTopBar, FrameLayout indicatorContainer, LinearLayout llRoot,
      TextView screenTitle, ViewPager2 viewPager2) {
    super(_bindingComponent, _root, _localFieldCount);
    this.closeBtn = closeBtn;
    this.doneBtn = doneBtn;
    this.flBottomBar = flBottomBar;
    this.flTopBar = flTopBar;
    this.indicatorContainer = indicatorContainer;
    this.llRoot = llRoot;
    this.screenTitle = screenTitle;
    this.viewPager2 = viewPager2;
  }

  @NonNull
  public static FragmentWhatsNewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentWhatsNewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentWhatsNewBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_whats_new, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWhatsNewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentWhatsNewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentWhatsNewBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_whats_new, null, false, component);
  }

  public static FragmentWhatsNewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentWhatsNewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentWhatsNewBinding)bind(component, view, org.edx.mobile.R.layout.fragment_whats_new);
  }
}
