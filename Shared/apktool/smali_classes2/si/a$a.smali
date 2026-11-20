.class public Lsi/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsi/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lsi/a;


# direct methods
.method public constructor <init>(Lsi/a;)V
    .locals 0

    iput-object p1, p0, Lsi/a$a;->a:Lsi/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public start()V
    .locals 2

    new-instance v0, Lbk/b;

    invoke-direct {v0}, Lbk/b;-><init>()V

    new-instance v1, Lsi/a$a$a;

    invoke-direct {v1, p0}, Lsi/a$a$a;-><init>(Lsi/a$a;)V

    invoke-virtual {v0, v1}, Lbk/b;->b(Lbk/b$b;)V

    return-void
.end method
