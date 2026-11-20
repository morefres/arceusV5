.class public final synthetic Lgm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# instance fields
.field public final synthetic a:Lgm/f;

.field public final synthetic b:Le/p;


# direct methods
.method public synthetic constructor <init>(Lgm/f;Le/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgm/a;->a:Lgm/f;

    iput-object p2, p0, Lgm/a;->b:Le/p;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lgm/a;->a:Lgm/f;

    iget-object v1, p0, Lgm/a;->b:Le/p;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, v1, p1}, Lgm/f;->e(Lgm/f;Le/p;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method
