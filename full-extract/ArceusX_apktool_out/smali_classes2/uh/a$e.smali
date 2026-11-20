.class public Luh/a$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luh/n$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luh/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic a:Luh/a;


# direct methods
.method public constructor <init>(Luh/a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Luh/a$e;->a:Luh/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Luh/a;Luh/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Luh/a$e;-><init>(Luh/a;)V

    return-void
.end method


# virtual methods
.method public a()Lrg/x0;
    .locals 1

    iget-object v0, p0, Luh/a$e;->a:Luh/a;

    return-object v0
.end method
