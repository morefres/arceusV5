.class public final synthetic Lth/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lth/j;


# direct methods
.method public synthetic constructor <init>(Lth/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lth/i;->a:Lth/j;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lth/i;->a:Lth/j;

    invoke-static {v0, p1}, Lth/j;->i3(Lth/j;Landroid/view/View;)V

    return-void
.end method
