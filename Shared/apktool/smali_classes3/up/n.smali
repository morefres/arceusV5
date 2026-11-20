.class public final synthetic Lup/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lup/i;


# direct methods
.method public synthetic constructor <init>(Lup/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup/n;->a:Lup/i;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object v0, p0, Lup/n;->a:Lup/i;

    invoke-static {v0, p1, p2}, Lup/p;->f(Lup/i;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
