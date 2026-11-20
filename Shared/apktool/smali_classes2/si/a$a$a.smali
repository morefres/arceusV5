.class public Lsi/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsi/a$a;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lsi/a$a;


# direct methods
.method public constructor <init>(Lsi/a$a;)V
    .locals 0

    iput-object p1, p0, Lsi/a$a$a;->a:Lsi/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lml/a;)V
    .locals 1

    iget-object p1, p0, Lsi/a$a$a;->a:Lsi/a$a;

    iget-object p1, p1, Lsi/a$a;->a:Lsi/a;

    const-string v0, "UserSelectedTheme"

    invoke-virtual {p1, v0}, Ldh/d;->d(Ljava/lang/String;)V

    return-void
.end method
