.class public final synthetic Lku/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lju/n;

.field public final synthetic b:Lku/f;


# direct methods
.method public synthetic constructor <init>(Lju/n;Lku/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lku/c;->a:Lju/n;

    iput-object p2, p0, Lku/c;->b:Lku/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lku/c;->a:Lju/n;

    iget-object v1, p0, Lku/c;->b:Lku/f;

    invoke-static {v0, v1}, Lku/f;->Y(Lju/n;Lku/f;)V

    return-void
.end method
