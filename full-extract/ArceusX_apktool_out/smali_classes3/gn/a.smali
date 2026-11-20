.class public final synthetic Lgn/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lgn/b;


# direct methods
.method public synthetic constructor <init>(Lgn/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgn/a;->a:Lgn/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lgn/a;->a:Lgn/b;

    invoke-static {v0}, Lgn/b;->a(Lgn/b;)V

    return-void
.end method
