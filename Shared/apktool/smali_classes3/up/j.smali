.class public final synthetic Lup/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lup/i;

.field public final synthetic b:Lvp/b;


# direct methods
.method public synthetic constructor <init>(Lup/i;Lvp/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup/j;->a:Lup/i;

    iput-object p2, p0, Lup/j;->b:Lvp/b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lup/j;->a:Lup/i;

    iget-object v1, p0, Lup/j;->b:Lvp/b;

    invoke-static {v0, v1, p1}, Lup/p;->c(Lup/i;Lvp/b;Landroid/view/View;)V

    return-void
.end method
