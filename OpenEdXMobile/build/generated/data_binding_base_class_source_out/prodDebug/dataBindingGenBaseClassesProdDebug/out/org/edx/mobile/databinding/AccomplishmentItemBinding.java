package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class AccomplishmentItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView date;

  @NonNull
  public final TextView description;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView name;

  @NonNull
  public final ImageButton share;

  protected AccomplishmentItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView date, TextView description, ImageView image, TextView name,
      ImageButton share) {
    super(_bindingComponent, _root, _localFieldCount);
    this.date = date;
    this.description = description;
    this.image = image;
    this.name = name;
    this.share = share;
  }

  @NonNull
  public static AccomplishmentItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AccomplishmentItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AccomplishmentItemBinding>inflate(inflater, org.edx.mobile.R.layout.accomplishment_item, root, attachToRoot, component);
  }

  @NonNull
  public static AccomplishmentItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AccomplishmentItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AccomplishmentItemBinding>inflate(inflater, org.edx.mobile.R.layout.accomplishment_item, null, false, component);
  }

  public static AccomplishmentItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static AccomplishmentItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (AccomplishmentItemBinding)bind(component, view, org.edx.mobile.R.layout.accomplishment_item);
  }
}
