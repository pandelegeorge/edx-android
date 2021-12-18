package org.edx.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import org.edx.mobile.view.custom.EdxRatingBar;

public abstract class FragmentDialogRatingBinding extends ViewDataBinding {
  @NonNull
  public final EdxRatingBar ratingBar;

  @NonNull
  public final TextView tvDescription;

  protected FragmentDialogRatingBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, EdxRatingBar ratingBar, TextView tvDescription) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ratingBar = ratingBar;
    this.tvDescription = tvDescription;
  }

  @NonNull
  public static FragmentDialogRatingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDialogRatingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDialogRatingBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_dialog_rating, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDialogRatingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentDialogRatingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentDialogRatingBinding>inflate(inflater, org.edx.mobile.R.layout.fragment_dialog_rating, null, false, component);
  }

  public static FragmentDialogRatingBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentDialogRatingBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentDialogRatingBinding)bind(component, view, org.edx.mobile.R.layout.fragment_dialog_rating);
  }
}
