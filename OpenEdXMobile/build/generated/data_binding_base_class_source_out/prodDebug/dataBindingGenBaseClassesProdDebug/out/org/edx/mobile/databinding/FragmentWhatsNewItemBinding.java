package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class FragmentWhatsNewItemBinding extends ViewDataBinding {
  @NonNull
  public final FrameLayout flImageContainer;

  @NonNull
  public final ImageView image;

  @NonNull
  public final LinearLayout llMessageContainer;

  @NonNull
  public final LinearLayout llWhatsNewItemRoot;

  @NonNull
  public final TextView message;

  @NonNull
  public final TextView title;

  protected FragmentWhatsNewItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, FrameLayout flImageContainer, ImageView image,
      LinearLayout llMessageContainer, LinearLayout llWhatsNewItemRoot, TextView message,
      TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.flImageContainer = flImageContainer;
    this.image = image;
    this.llMessageContainer = llMessageContainer;
    this.llWhatsNewItemRoot = llWhatsNewItemRoot;
    this.message = message;
    this.title = title;
  }

  @NonNull
  public static FragmentWhatsNewItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentWhatsNewItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentWhatsNewItemBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_whats_new_item, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWhatsNewItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentWhatsNewItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentWhatsNewItemBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_whats_new_item, null, false, component);
  }

  public static FragmentWhatsNewItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentWhatsNewItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentWhatsNewItemBinding)bind(component, view, org.edx.mobile.R.layout.fragment_whats_new_item);
  }
}
