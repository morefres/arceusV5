.class public final synthetic Lcn/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Lcn/e;

.field public final synthetic b:Lcn/e$a;


# direct methods
.method public synthetic constructor <init>(Lcn/e;Lcn/e$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcn/b;->a:Lcn/e;

    iput-object p2, p0, Lcn/b;->b:Lcn/e$a;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object v0, p0, Lcn/b;->a:Lcn/e;

    iget-object v1, p0, Lcn/b;->b:Lcn/e$a;

    invoke-static {v0, v1, p1, p2}, Lcn/c;->f(Lcn/e;Lcn/e$a;Landroid/content/DialogInterface;I)V

    return-void
.end method
